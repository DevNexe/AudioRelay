package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hk extends qn1 {
    public static final hk D = new hk(oq.m, 0, oq.l);

    public hk(oq oqVar, long j, nq2<oq> nq2Var) {
        super(oqVar, j, nq2Var);
        if (this.C) {
            return;
        }
        this.C = true;
    }

    @Override // defpackage.qn1
    public final void b() {
    }

    @Override // defpackage.qn1
    public final oq g() {
        return null;
    }

    @Override // defpackage.qn1
    public final void h() {
    }

    public final String toString() {
        return "ByteReadPacket(" + (((long) (this.A - this.z)) + this.B) + " bytes remaining)";
    }
}
