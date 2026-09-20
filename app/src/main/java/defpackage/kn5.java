package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum kn5 {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public final boolean a() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
