public class JSONFormatter extends FormatDecorator {    
    public JSONFormatter(BaseLogger logger){
        this.logger = logger;
    }

    public String getLabel() {
		return logger.getLabel() + ", JSONFormatter";
	}

	public String getLevel() {
		return "Info " + logger.getLevel();
	}
}
