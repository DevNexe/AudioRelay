package defpackage;

import io.ktor.websocket.CQf;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.websocket.DefaultWebSocketSessionImpl", f = "DefaultWebSocketSession.kt", l = {297}, m = "checkMaxFrameSize")
public final class ii0 extends b90 {
    public /* synthetic */ Object A;
    public final /* synthetic */ CQf B;
    public int C;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii0(CQf cQf, z80<? super ii0> z80Var) {
        super(z80Var);
        this.B = cQf;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return CQf.a(this.B, null, null, this);
    }
}
