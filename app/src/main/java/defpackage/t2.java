package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t2 extends bc0.LPt8Fixed {
    public final lj1<bc0.LPt8Fixed.QnHx> a;
    public final String b;

    public t2() {
        throw null;
    }

    public t2(lj1 lj1Var, String str) {
        this.a = lj1Var;
        this.b = str;
    }

    @Override // bc0.LPt8Fixed
    public final lj1<bc0.LPt8Fixed.QnHx> a() {
        return this.a;
    }

    @Override // bc0.LPt8Fixed
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.LPt8Fixed)) {
            return false;
        }
        bc0.LPt8Fixed lPt8 = (bc0.LPt8Fixed) obj;
        if (this.a.equals(lPt8.a())) {
            String str = this.b;
            if (str == null) {
                if (lPt8.b() == null) {
                    return true;
                }
            } else if (str.equals(lPt8.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return i5.b(sb, this.b, "}");
    }
}
