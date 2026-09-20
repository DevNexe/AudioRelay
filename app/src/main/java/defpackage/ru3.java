package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ru3 {
    public final COm6Fixed a;
    public final ny1 b;
    public final fu0 c;
    public List<? extends Proxy> d;
    public int e;
    public List<? extends InetSocketAddress> f;
    public final ArrayList g;

    public static final class QnHx {
        public final List<pu3> a;
        public int b;

        public QnHx(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean a() {
            return this.b < this.a.size();
        }
    }

    public ru3(COm6Fixed cOm6, ny1 ny1Var, bj3 bj3Var, fu0 fu0Var) {
        List<? extends Proxy> listL;
        this.a = cOm6;
        this.b = ny1Var;
        this.c = fu0Var;
        cs0 cs0Var = cs0.w;
        this.d = cs0Var;
        this.f = cs0Var;
        this.g = new ArrayList();
        Proxy proxy = cOm6.g;
        if (proxy != null) {
            listL = Collections.singletonList(proxy);
        } else {
            URI uriG = cOm6.i.g();
            if (uriG.getHost() == null) {
                listL = qf5.l(Proxy.NO_PROXY);
            } else {
                List<Proxy> listSelect = cOm6.h.select(uriG);
                List<Proxy> list = listSelect;
                listL = list == null || list.isEmpty() ? qf5.l(Proxy.NO_PROXY) : qf5.v(listSelect);
            }
        }
        this.d = listL;
        this.e = 0;
    }

    public final boolean a() {
        return (this.e < this.d.size()) || (this.g.isEmpty() ^ true);
    }
}
