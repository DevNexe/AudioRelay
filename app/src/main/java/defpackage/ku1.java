package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ku1 extends su1 {
    public final boolean w;
    public final String x;

    public ku1(Object obj, boolean z) {
        this.w = z;
        this.x = obj.toString();
    }

    @Override // defpackage.su1
    public final String a() {
        return this.x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ur1.a(nl3.a(ku1.class), nl3.a(obj.getClass()))) {
            return false;
        }
        ku1 ku1Var = (ku1) obj;
        return this.w == ku1Var.w && ur1.a(this.x, ku1Var.x);
    }

    public final int hashCode() {
        return this.x.hashCode() + ((this.w ? 1231 : 1237) * 31);
    }

    @Override // defpackage.su1
    public final String toString() {
        String str = this.x;
        if (!this.w) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        uu4.a(str, sb);
        return sb.toString();
    }
}
