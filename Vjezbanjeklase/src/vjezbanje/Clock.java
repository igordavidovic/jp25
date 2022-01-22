package vjezbanje;

public class Clock {
	private int hours;
	private int minutes;
	private int seconds;

	public Clock() {
		hours = 12;
		minutes = 0;
		seconds = 0;
	}

	public Clock(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public Clock(int seconds) {
		this.seconds = seconds;
		convert();
	}

	private void convert() {
		hours = seconds / 3600;
		seconds = seconds - (hours * 3600);
		minutes = seconds / 60;
		seconds = seconds - (minutes * 60);
	}

	public int setClock(int seconds) {
		this.seconds = seconds;

		convert();

		return seconds;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public void tick() {
		seconds++;

		if (seconds > 59) {
			seconds -= 60;
			minutes += 1;
		}
	}

	public Clock subtractClock(Clock clock) {
		int newsec;
		int newmin;
		int newh;
		if(provjeraVelicine(clock) == false) {
			newsec = clock.seconds - seconds;
			newmin = clock.minutes - minutes;
			newh = clock.hours - hours;
		}else {
			newsec = seconds - clock.seconds;
			newmin = minutes - clock.minutes;
			newh = hours - clock.hours;
		}
		Clock clock2 = new Clock(newh, newmin, newsec);
		return clock2;
	}
	
	private boolean provjeraVelicine(Clock clock) {
		int temp;
		if (hours > clock.hours) {
			temp = 1;
		} else {
			temp = 2;
		}
		if (temp == 1) {
			if (clock.seconds > seconds) {
				while (clock.seconds > seconds) {
					seconds += 60;
					clock.minutes += 1;
				}
			}
			if (clock.minutes > minutes) {
				while (clock.minutes > minutes) {
					minutes += 60;
					clock.hours += 1;
				}	
			}
			return true;
		} else {
				while (seconds > clock.seconds) {
					clock.seconds += 60;
					minutes += 1;
			}
				while (minutes > clock.minutes) {
					clock.minutes += 60;
					hours += 1;
			}
			return false;
		}
	}
	
	public Clock addClock(Clock clock) {
		int newh = hours + clock.hours;
		int newmin = minutes + clock.minutes;
		int newsec = seconds + clock.seconds;
		while(newsec >= 60) {
			newsec -= 60;
			newmin += 1;
		}
		while(newmin >= 60) {
			newmin -= 60;
			newh += 1;
		}
		Clock clock2 = new Clock(newh, newmin, newsec);
		return clock2;
	}
	
	public void tickDown() {
		seconds--;

		if (seconds < 0) {
			seconds += 59;
			minutes -= 1;
		}
	}
	
	public String getHMS() {
		if(seconds < 10 && minutes < 10 && hours < 10) {
			return new StringBuilder().append("0").append(hours).append(":").append("0").append(minutes).append(":").append("0").append(seconds).toString();
		}else if(hours < 10 && minutes < 10) {
			return new StringBuilder().append("0").append(hours).append(":").append("0").append(minutes).append(":").append(seconds).toString();
		}else if(hours < 10 && seconds < 10) {
			return new StringBuilder().append("0").append(hours).append(":").append(minutes).append(":").append("0").append(seconds).toString();
		}else if(minutes < 10 && seconds < 10) {
			return new StringBuilder().append(hours).append(":").append("0").append(minutes).append(":").append("0").append(seconds).toString();
		}else if(hours < 10) {
			return new StringBuilder().append("0").append(hours).append(":").append(minutes).append(":").append(seconds).toString();
		}else if(minutes < 10) {
			return new StringBuilder().append(hours).append(":").append("0").append(minutes).append(":").append(seconds).toString();
		}else if(seconds < 10) {
			return new StringBuilder().append(hours).append(":").append(minutes).append(":").append("0").append(seconds).toString();
		}
		else {
		return new StringBuilder().append(hours).append(":").append(minutes).append(":").append(seconds).toString();
		}
	}
	
	@Override
	public String toString() {
		return getHMS();
	}
	
	
}
