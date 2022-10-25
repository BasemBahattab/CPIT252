public class YAMLFormatter extends FormatDecorator {    
    public YAMLFormatter(BaseLogger logger){
        this.logger = logger;
    }
    public String getLabel() {
		return logger.getLabel() + ", YAMLFormatter";
	}
	public String getLevel() {
		return "Info " + logger.getLevel();
	}
}
