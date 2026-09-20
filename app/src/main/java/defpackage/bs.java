package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bs extends B8C {
    public final Sb1 A;
    public final Sb1 B;
    public final String w;
    public final mv2 x;
    public final String y;
    public final h04 z;

    public bs(String str, mv2 mv2Var, String str2, h04 h04Var, Sb1 sb1, Sb1 sb2) {
        this.w = str;
        this.x = mv2Var;
        this.y = str2;
        this.z = h04Var;
        this.A = sb1;
        this.B = sb2;
    }

    @Override // defpackage.B8C
    public final h04 B0() {
        return this.z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs)) {
            return false;
        }
        bs bsVar = (bs) obj;
        return ur1.a(this.w, bsVar.w) && this.x == bsVar.x && ur1.a(this.y, bsVar.y) && ur1.a(this.z, bsVar.z) && ur1.a(this.A, bsVar.A) && ur1.a(this.B, bsVar.B);
    }

    public final int hashCode() {
        return this.B.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + bl2.a(this.y, (this.x.hashCode() + (this.w.hashCode() * 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClientConfig(version=" + this.w + ", os=" + this.x + ", osVersion=" + this.y + ", properties=" + this.z + ", audioConfig=" + this.A + ", fallbackAudioConfig=" + this.B + ")";
    }

    @Override // defpackage.B8C
    public final mv2 z0() {
        return this.x;
    }
}
