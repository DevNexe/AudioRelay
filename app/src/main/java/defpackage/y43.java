package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y43 {
    public final String a;
    public final ry4 b;
    public final boolean c;
    public final boolean d;

    public y43(String str) {
        this.a = str;
        boolean z = true;
        boolean zX = iv4.x(str, "windows", true);
        this.b = new ry4(new w43(this));
        boolean zX2 = iv4.x(str, "linux", true);
        boolean zX3 = iv4.x(str, "mac", true);
        this.c = zX3;
        if (!zX && !zX2 && !zX3) {
            z = false;
        }
        this.d = z;
    }
}
