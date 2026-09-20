package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.websocket.WebSockets$Plugin$install$1", f = "WebSockets.kt", l = {161}, m = "invokeSuspend")
public final class xl5 extends px4 implements y81<k33<Object, ig1>, Object, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ k33 B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ wl5 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl5(wl5 wl5Var, z80 z80Var, boolean z) {
        super(3, z80Var);
        this.C = z;
        this.D = wl5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            k33 k33Var = this.B;
            String str = ((ig1) k33Var.w).a.a.a;
            if (!(ur1.a(str, "ws") || ur1.a(str, "wss"))) {
                return sd5.a;
            }
            ig1 ig1Var = (ig1) k33Var.w;
            ml5 ml5Var = ml5.a;
            sd5 sd5Var = sd5.a;
            ig1Var.getClass();
            ((Map) ig1Var.f.f(gf1.a, hg1.w)).put(ml5Var, sd5Var);
            if (this.C) {
                List list = (List) this.D.c.x;
                ArrayList arrayList = new ArrayList(mu.w0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((ol5) ((h81) it.next()).invoke());
                }
                ig1Var.f.a(zl5.a, arrayList);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    su.x0(((ol5) it2.next()).b(), arrayList2);
                }
                if (!arrayList2.isEmpty()) {
                    String strM0 = wu.M0(arrayList2, ";", null, null, null, 62);
                    List<String> list2 = rf1.a;
                    ig1Var.a().e("Sec-WebSocket-Extensions", strM0.toString());
                    sd5 sd5Var2 = sd5.a;
                }
            }
            nl5 nl5Var = new nl5();
            this.A = 1;
            if (k33Var.e(nl5Var, this) == va0Var) {
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
    public final Object invoke(k33<Object, ig1> k33Var, Object obj, z80<? super sd5> z80Var) {
        boolean z = this.C;
        xl5 xl5Var = new xl5(this.D, z80Var, z);
        xl5Var.B = k33Var;
        return xl5Var.i(sd5.a);
    }
}
