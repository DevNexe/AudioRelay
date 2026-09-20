package defpackage;

import com.facebook.ads.AdError;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class bg0 extends jh0<oq> {
    public final int B;
    public final tHM C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg0() {
        super(AdError.NETWORK_ERROR_CODE);
        qLd qld = qLd.x;
        this.B = 4096;
        this.C = qld;
    }

    @Override // defpackage.jh0
    public final oq c(oq oqVar) {
        oq oqVar2 = oqVar;
        oqVar2.l();
        oqVar2.j();
        return oqVar2;
    }

    @Override // defpackage.jh0
    public final void f(oq oqVar) {
        oq oqVar2 = oqVar;
        ByteBuffer byteBuffer = oqVar2.a;
        this.C.a();
        if (!oq.j.compareAndSet(oqVar2, 0, -1)) {
            throw new IllegalStateException("Unable to unlink: buffer is in use.");
        }
        oqVar2.f();
        oqVar2.h = null;
    }

    @Override // defpackage.jh0
    public final oq g() {
        return new oq(this.C.b(this.B), this);
    }

    @Override // defpackage.jh0
    public final void i(oq oqVar) {
        oq oqVar2 = oqVar;
        ByteBuffer byteBuffer = oqVar2.a;
        long jLimit = byteBuffer.limit();
        int i = this.B;
        if (!(jLimit == ((long) i))) {
            StringBuilder sbC = iZUl.c("Buffer size mismatch. Expected: ", i, ", actual: ");
            sbC.append(byteBuffer.limit());
            throw new IllegalStateException(sbC.toString().toString());
        }
        oq oqVar3 = oq.m;
        if (!(oqVar2 != oqVar3)) {
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled".toString());
        }
        if (!(oqVar2 != oqVar3)) {
            throw new IllegalStateException("Empty instance couldn't be recycled".toString());
        }
        if (!(oqVar2.h() == 0)) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.".toString());
        }
        if (!(oqVar2.g() == null)) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.".toString());
        }
        if (!(oqVar2.h == null)) {
            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.".toString());
        }
    }
}
