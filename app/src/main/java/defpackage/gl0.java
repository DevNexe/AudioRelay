package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gl0 {
    public final String a;
    public final float b;

    public gl0(float f, String str) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl0)) {
            return false;
        }
        gl0 gl0Var = (gl0) obj;
        return ur1.a(this.a, gl0Var.a) && ur1.a(Float.valueOf(this.b), Float.valueOf(gl0Var.b));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisconnectTimer(formattedRemainingTime=" + this.a + ", progress=" + this.b + ")";
    }
}
