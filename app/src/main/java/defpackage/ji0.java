package defpackage;

import io.ktor.websocket.CQf;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", l = {234, 237, 245}, m = "outgoingProcessorLoop")
public final class ji0 extends b90 {
    public wo A;
    public /* synthetic */ Object B;
    public final /* synthetic */ CQf C;
    public int D;
    public CQf z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji0(CQf cQf, z80<? super ji0> z80Var) {
        super(z80Var);
        this.C = cQf;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return CQf.c(this.C, this);
    }
}
