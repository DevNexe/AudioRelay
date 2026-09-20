package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yb4 extends B8C {
    public final String w;
    public final mv2 x;
    public final String y;
    public final h04 z;

    public yb4(String str, mv2 mv2Var, String str2, h04 h04Var) {
        this.w = str;
        this.x = mv2Var;
        this.y = str2;
        this.z = h04Var;
    }

    @Override // defpackage.B8C
    public final h04 B0() {
        return this.z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb4)) {
            return false;
        }
        yb4 yb4Var = (yb4) obj;
        return ur1.a(this.w, yb4Var.w) && this.x == yb4Var.x && ur1.a(this.y, yb4Var.y) && ur1.a(this.z, yb4Var.z);
    }

    public final int hashCode() {
        return this.z.hashCode() + bl2.a(this.y, (this.x.hashCode() + (this.w.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ServerConfig(version=" + this.w + ", os=" + this.x + ", osVersion=" + this.y + ", properties=" + this.z + ")";
    }

    @Override // defpackage.B8C
    public final mv2 z0() {
        return this.x;
    }
}
