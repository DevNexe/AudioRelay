package defpackage;

import io.ktor.utils.io.QnHx;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class s24 extends qg1 {
    public final u91 A;
    public final mc1 B;
    public final la0 C;
    public final QnHx D;
    public final q24 w;
    public final zg1 x;
    public final ag1 y;
    public final u91 z;

    public s24(q24 q24Var, byte[] bArr, qg1 qg1Var) {
        this.w = q24Var;
        os1 os1VarE = AY.e();
        this.x = qg1Var.i();
        this.y = qg1Var.j();
        this.z = qg1Var.e();
        this.A = qg1Var.h();
        this.B = qg1Var.a();
        this.C = qg1Var.g().g0(os1VarE);
        this.D = new QnHx(ByteBuffer.wrap(bArr, 0, bArr.length));
    }

    @Override // defpackage.sf1
    public final mc1 a() {
        return this.B;
    }

    @Override // defpackage.qg1
    public final ve1 c() {
        return this.w;
    }

    @Override // defpackage.qg1
    public final fk d() {
        return this.D;
    }

    @Override // defpackage.qg1
    public final u91 e() {
        return this.z;
    }

    @Override // defpackage.ua0
    public final la0 g() {
        return this.C;
    }

    @Override // defpackage.qg1
    public final u91 h() {
        return this.A;
    }

    @Override // defpackage.qg1
    public final zg1 i() {
        return this.x;
    }

    @Override // defpackage.qg1
    public final ag1 j() {
        return this.y;
    }
}
