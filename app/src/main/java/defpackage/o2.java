package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o2 extends gs {
    public final gs.QnHx a;
    public final QlK2 b;

    public o2(gs.QnHx qnHx, QlK2 qlK2) {
        this.a = qnHx;
        this.b = qlK2;
    }

    @Override // defpackage.gs
    public final QlK2 a() {
        return this.b;
    }

    @Override // defpackage.gs
    public final gs.QnHx b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gs)) {
            return false;
        }
        gs gsVar = (gs) obj;
        gs.QnHx qnHx = this.a;
        if (qnHx != null ? qnHx.equals(gsVar.b()) : gsVar.b() == null) {
            QlK2 qlK2 = this.b;
            if (qlK2 == null) {
                if (gsVar.a() == null) {
                    return true;
                }
            } else if (qlK2.equals(gsVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        gs.QnHx qnHx = this.a;
        int iHashCode = ((qnHx == null ? 0 : qnHx.hashCode()) ^ 1000003) * 1000003;
        QlK2 qlK2 = this.b;
        return (qlK2 != null ? qlK2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
