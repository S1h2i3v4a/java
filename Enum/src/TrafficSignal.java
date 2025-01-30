public enum TrafficSignal {
    RED("Stop"),GREEN("Start"),YELLOW("Ready");
    private String action;

    public String getAction(){
        System.out.println(this.action);
        return "";
    }

    private TrafficSignal(String action) {
        this.action = action;
    }
}
