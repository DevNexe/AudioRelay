package defpackage;

import androidx.activity.ComponentActivity;
import com.revenuecat.purchases.CacheFetchPolicy;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.ListenerConversionsKt;
import com.revenuecat.purchases.Purchases;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class yc3 implements ad3, xr4 {
    public final ha a;
    public final yr3 b;
    public final qg3<sd5> c = new qg3<>();

    public yc3(pa paVar, yr3 yr3Var) {
        this.a = paVar;
        this.b = yr3Var;
    }

    @Override // defpackage.ad3
    public final vq2<Boolean> a(c54 c54Var) {
        return this.a.a(c54Var);
    }

    @Override // defpackage.wc3
    public final void b() {
        this.c.accept(sd5.a);
    }

    @Override // defpackage.ad3
    public final vk4<List<n43>> c() {
        vk4<bs3> vk4VarB = this.b.b.b();
        KnU knU = new KnU(17);
        vk4VarB.getClass();
        return new fl4(vk4VarB, knU);
    }

    @Override // defpackage.ad3
    public final vk4 d(ComponentActivity componentActivity, o43 o43Var, n43 n43Var) {
        yr3 yr3Var = this.b;
        yr3Var.getClass();
        return new bl4(new yk4(new zq3(n43Var, o43Var, componentActivity, yr3Var)), new rq1(this, 9));
    }

    @Override // defpackage.ad3
    public final vk4 e(ComponentActivity componentActivity, n43 n43Var) {
        yr3 yr3Var = this.b;
        yr3Var.getClass();
        return new bl4(new yk4(new ar3(n43Var, componentActivity, yr3Var)), new xc3(this, 0));
    }

    @Override // defpackage.ad3
    public final vk4<qa> f() {
        this.b.getClass();
        return new yk4(new n8V_(1));
    }

    @Override // defpackage.ad3
    public final vk4<List<zg3>> g(final boolean z) {
        this.b.getClass();
        return new yk4(new ol4() { // from class: yq3
            @Override // defpackage.ol4
            public final void c(yk4.QnHx qnHx) {
                ListenerConversionsKt.getCustomerInfoWith(Purchases.Companion.getSharedInstance(), z ? CacheFetchPolicy.FETCH_CURRENT : CacheFetchPolicy.CACHED_OR_FETCHED, new er3(qnHx), new lr3(qnHx));
            }
        });
    }

    @Override // defpackage.wc3
    public final vq2<dd3> h(c54 c54Var) {
        yr3 yr3Var = this.b;
        yr3Var.getClass();
        KnU knU = new KnU(16);
        v9<xq0<String, CustomerInfo>> v9Var = yr3Var.d;
        v9Var.getClass();
        return new hr2(new cs2(v9Var, knU));
    }

    @Override // defpackage.xr4
    public final qw start() {
        long jG = gq0.g(zc3.a);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yr3 yr3Var = this.b;
        yr3Var.getClass();
        KnU knU = new KnU(16);
        v9<xq0<String, CustomerInfo>> v9Var = yr3Var.d;
        v9Var.getClass();
        return qw.e(ps0.M(new zr2(new ls2(new ys2(this.c.C(jG, timeUnit).u(j54.c), new D(this, 19)))), new fx(new l83(yr3Var, 3)), new zr2(new jr2(new pr2(new rs2(new cs2(v9Var, knU)), new m71(2)), new xc3(this, 1), m91.d, m91.c))));
    }
}
