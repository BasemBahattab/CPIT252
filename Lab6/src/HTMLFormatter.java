public class HTMLFormatter extends FormatDecorator {    
    public HTMLFormatter(BaseLogger logger){
        this.logger = logger;
    }

    public String getLabel() {
		return logger.getLabel() + ", HTMLFormatter";
	}

	public String getLevel() {
		return "Info " + logger.getLevel();
	}
}
