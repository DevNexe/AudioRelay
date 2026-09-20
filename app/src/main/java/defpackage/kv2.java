package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum kv2 {
    /* JADX INFO: Fake field, exist only in values array */
    Unsupported(-1, "uninitialized"),
    /* JADX INFO: Fake field, exist only in values array */
    None(1, "none"),
    Latency(2, "latency"),
    LatencyWithEffects(3, "latency_with_effects");

    public final int w;
    public final String x;

    kv2(int i, String str) {
        this.w = i;
        this.x = str;
    }
}
