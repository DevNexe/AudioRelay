package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c47 extends uw5 {
    public final /* synthetic */ int y = 0;
    public final Object z;

    public c47(pq2 pq2Var) {
        super("internal.logger");
        this.z = pq2Var;
        HashMap map = this.x;
        map.put("log", new qa7(this, false, true));
        map.put("silent", new n87());
        ((uw5) map.get("silent")).b("log", new qa7(this, true, true));
        map.put("unmonitored", new o97());
        ((uw5) map.get("unmonitored")).b("log", new qa7(this, false, false));
    }

    @Override // defpackage.uw5
    public final ez5 d(ma5 ma5Var, List list) {
        switch (this.y) {
            case 0:
                nw6.h("getValue", 2, list);
                ez5 ez5VarB = ma5Var.b((ez5) list.get(0));
                ez5 ez5VarB2 = ma5Var.b((ez5) list.get(1));
                String strZzi = ez5VarB.zzi();
                cq4 cq4Var = (cq4) this.z;
                String str = null;
                Map map = (Map) ((wl6) cq4Var.y).d.getOrDefault((String) cq4Var.x, null);
                if (map != null && map.containsKey(strZzi)) {
                    str = (String) map.get(strZzi);
                }
                return str != null ? new f06(str) : ez5VarB2;
            default:
                return ez5.o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c47(cq4 cq4Var) {
        super("getValue");
        this.z = cq4Var;
    }
}
