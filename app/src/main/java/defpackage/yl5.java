package defpackage;

import io.ktor.websocket.CQf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$2", f = "WebSockets.kt", l = {184}, m = "invokeSuspend")
public final class yl5 extends px4 implements y81<k33<rg1, ve1>, rg1, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ k33 B;
    public /* synthetic */ rg1 C;
    public final /* synthetic */ wl5 D;
    public final /* synthetic */ boolean E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl5(wl5 wl5Var, z80 z80Var, boolean z) {
        super(3, z80Var);
        this.D = wl5Var;
        this.E = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ig0] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8, types: [cs0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        ?? yi0Var;
        hi0 hi0Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            k33 k33Var = this.B;
            rg1 rg1Var = this.C;
            rb5 rb5Var = rg1Var.a;
            Object obj2 = rg1Var.b;
            if (!(obj2 instanceof tl5)) {
                return sd5.a;
            }
            if (ur1.a(rb5Var.a, nl3.a(ig0.class))) {
                tl5 tl5Var = (tl5) obj2;
                wl5 wl5Var = this.D;
                wl5Var.getClass();
                boolean z = tl5Var instanceof hi0;
                if (z) {
                    hi0Var = (hi0) tl5Var;
                } else {
                    long j = wl5Var.a;
                    long j2 = ((long) 2) * j;
                    ta0 ta0Var = li0.a;
                    if (!(!z)) {
                        throw new IllegalArgumentException("Cannot wrap other DefaultWebSocketSession".toString());
                    }
                    CQf cQf = new CQf(tl5Var, j, j2);
                    cQf.q0(wl5Var.b);
                    hi0Var = cQf;
                }
                ve1 ve1Var = (ve1) k33Var.w;
                ?? ig0Var = new ig0(hi0Var);
                ?? arrayList = cs0.w;
                if (this.E) {
                    mc1 mc1VarA = ve1Var.e().a();
                    List<String> list = rf1.a;
                    String str = mc1VarA.get("Sec-WebSocket-Extensions");
                    if (str != null) {
                        List listQ = mv4.Q(str, new String[]{","});
                        ArrayList arrayList2 = new ArrayList(mu.w0(listQ, 10));
                        Iterator it = listQ.iterator();
                        while (it.hasNext()) {
                            List listQ2 = mv4.Q((String) it.next(), new String[]{";"});
                            String string = mv4.W((String) wu.H0(listQ2)).toString();
                            List listD0 = wu.D0(listQ2);
                            ArrayList arrayList3 = new ArrayList(mu.w0(listD0, 10));
                            Iterator it2 = listD0.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(mv4.W((String) it2.next()).toString());
                            }
                            arrayList2.add(new ss3(string, arrayList3));
                        }
                    }
                    List list2 = (List) ve1Var.getAttributes().e(zl5.a);
                    arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (((ol5) obj3).d()) {
                            arrayList.add(obj3);
                        }
                    }
                }
                ig0Var.h0(arrayList);
                yi0Var = ig0Var;
            } else {
                yi0Var = new yi0((tl5) obj2);
            }
            rg1 rg1Var2 = new rg1(rb5Var, yi0Var);
            this.B = null;
            this.A = 1;
            if (k33Var.e(rg1Var2, this) == va0Var) {
                return va0Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(obj);
        }
        return sd5.a;
    }

    @Override // defpackage.y81
    public final Object invoke(k33<rg1, ve1> k33Var, rg1 rg1Var, z80<? super sd5> z80Var) {
        yl5 yl5Var = new yl5(this.D, z80Var, this.E);
        yl5Var.B = k33Var;
        yl5Var.C = rg1Var;
        return yl5Var.i(sd5.a);
    }
}
