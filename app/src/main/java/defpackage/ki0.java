package defpackage;

import io.ktor.util.cio.ChannelIOException;
import io.ktor.websocket.CQf;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1", f = "DefaultWebSocketSession.kt", l = {219, 229, 229, 229, 229, 229, 226, 229, 229}, m = "invokeSuspend")
public final class ki0 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public Throwable A;
    public int B;
    public final /* synthetic */ CQf C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki0(CQf cQf, z80<? super ki0> z80Var) {
        super(2, z80Var);
        this.C = cQf;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new ki0(this.C, z80Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[RETURN] */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i = this.B;
        CQf cQf = this.C;
        try {
            try {
                switch (i) {
                    case 0:
                        C0239D.H(obj);
                        this.B = 1;
                        if (CQf.c(cQf, this) == obj2) {
                            return obj2;
                        }
                        cQf.z.m(null);
                        this.B = 2;
                        if (ul5.a(cQf.w, new lt(lt.QnHx.NORMAL, ""), this) == obj2) {
                            return obj2;
                        }
                        return sd5.a;
                    case 1:
                        C0239D.H(obj);
                        cQf.z.m(null);
                        this.B = 2;
                        if (ul5.a(cQf.w, new lt(lt.QnHx.NORMAL, ""), this) == obj2) {
                            return obj2;
                        }
                        return sd5.a;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                        C0239D.H(obj);
                        return sd5.a;
                    case 7:
                        C0239D.H(obj);
                        cQf.z.m(null);
                        this.B = 8;
                        if (ul5.a(cQf.w, new lt(lt.QnHx.NORMAL, ""), this) == obj2) {
                            return obj2;
                        }
                        return sd5.a;
                    case 9:
                        Throwable th = this.A;
                        C0239D.H(obj);
                        throw th;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (ChannelIOException unused) {
                cQf.z.m(null);
                this.B = 6;
                if (ul5.a(cQf.w, new lt(lt.QnHx.NORMAL, ""), this) == obj2) {
                    return obj2;
                }
            } catch (CancellationException unused2) {
                cQf.z.m(null);
                this.B = 5;
                if (ul5.a(cQf.w, new lt(lt.QnHx.NORMAL, ""), this) == obj2) {
                    return obj2;
                }
            } catch (ClosedReceiveChannelException unused3) {
                cQf.z.m(null);
                this.B = 4;
                if (ul5.a(cQf.w, new lt(lt.QnHx.NORMAL, ""), this) == obj2) {
                    return obj2;
                }
            } catch (ClosedSendChannelException unused4) {
                cQf.z.m(null);
                this.B = 3;
                if (ul5.a(cQf.w, new lt(lt.QnHx.NORMAL, ""), this) == obj2) {
                    return obj2;
                }
            } catch (Throwable th2) {
                cQf.z.m(ps0.b("Failed to send frame", th2));
                tl5 tl5Var = cQf.w;
                this.B = 7;
                Object objA = ul5.a(tl5Var, th2 instanceof CancellationException ? new lt(lt.QnHx.NORMAL, "") : new lt(lt.QnHx.INTERNAL_ERROR, th2.toString()), this);
                if (objA != obj2) {
                    objA = sd5.a;
                }
                if (objA == obj2) {
                    return obj2;
                }
            }
        } catch (Throwable th3) {
            cQf.z.m(null);
            this.A = th3;
            this.B = 9;
            if (ul5.a(cQf.w, new lt(lt.QnHx.NORMAL, ""), this) == obj2) {
                return obj2;
            }
            throw th3;
        }
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((ki0) a(ua0Var, z80Var)).i(sd5.a);
    }
}
