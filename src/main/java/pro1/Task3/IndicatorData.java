package pro1.Task3;

import com.google.gson.annotations.SerializedName;

public class IndicatorData {
    @SerializedName("dfd")
    private boolean dfd;

    @SerializedName("enableEnterpriseNewTasksExperiment")
    private boolean enterprise;

    @SerializedName("showNewTasksButton")
    private boolean button;

    public boolean isDfd() {
        return dfd;
    }

    public boolean isEnterprise() {
        return enterprise;
    }

    public boolean isButton() {
        return button;
    }
}