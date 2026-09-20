package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cd4 {
    public final int a = 59100;
    public final int b = 59100;
    public final int c = 59200;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd4)) {
            return false;
        }
        cd4 cd4Var = (cd4) obj;
        return this.a == cd4Var.a && this.b == cd4Var.b && this.c == cd4Var.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerNetworkOptions(messagingPort=");
        sb.append(this.a);
        sb.append(", audioDataPort=");
        sb.append(this.b);
        sb.append(", broadcastPort=");
        return ex0.c(sb, this.c, ")");
    }
}
