package defpackage;

import io.ktor.utils.io.QnHx;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class q24 extends ve1 {
    public final byte[] B;
    public final boolean C;

    public q24(ue1 ue1Var, gg1 gg1Var, qg1 qg1Var, byte[] bArr) {
        super(ue1Var);
        this.B = bArr;
        this.x = new r24(this, gg1Var);
        this.y = new s24(this, bArr, qg1Var);
        this.C = true;
    }

    @Override // defpackage.ve1
    public final boolean c() {
        return this.C;
    }

    @Override // defpackage.ve1
    public final Object h() {
        byte[] bArr = this.B;
        return new QnHx(ByteBuffer.wrap(bArr, 0, bArr.length));
    }
}
