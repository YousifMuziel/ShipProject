class ManualContentList extends ShipContainer {
    private String contents;

    public ManualContentList(int containerID) {
        super(containerID);
        contents = "";
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String containerContentList() {
        return contents;
    }
}
