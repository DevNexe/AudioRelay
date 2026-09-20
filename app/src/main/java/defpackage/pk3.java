package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pk3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public pk3(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk3)) {
            return false;
        }
        pk3 pk3Var = (pk3) obj;
        return ur1.a(this.a, pk3Var.a) && ur1.a(this.b, pk3Var.b) && ur1.a(this.c, pk3Var.c) && ur1.a(this.d, pk3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + bl2.a(this.c, bl2.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentFormattedStats(maxLatency=");
        sb.append(this.a);
        sb.append(", averagePacketLatency=");
        sb.append(this.b);
        sb.append(", latePacketPercent=");
        sb.append(this.c);
        sb.append(", packetLossPercent=");
        return i5.b(sb, this.d, ")");
    }
}
