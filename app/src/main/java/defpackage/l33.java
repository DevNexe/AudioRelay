package defpackage;

import java.net.DatagramPacket;

/* JADX INFO: loaded from: classes.dex */
public final class l33 {
    public final je4 a;
    public final DatagramPacket b;

    public l33(je4 je4Var, DatagramPacket datagramPacket) {
        this.a = je4Var;
        this.b = datagramPacket;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l33)) {
            return false;
        }
        l33 l33Var = (l33) obj;
        return ur1.a(this.a, l33Var.a) && ur1.a(this.b, l33Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PipelineDestination(serverSession=" + this.a + ", destinationPacket=" + this.b + ")";
    }
}
