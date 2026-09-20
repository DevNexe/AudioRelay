package defpackage;

import com.facebook.ads.AdError;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class n17 extends uw5 {
    public final /* synthetic */ int y = 1;
    public final Object z;

    public n17(cq4 cq4Var) {
        super("internal.remoteConfig");
        this.z = cq4Var;
        this.x.put("getValue", new c47(cq4Var));
    }

    @Override // defpackage.uw5
    public final ez5 d(ma5 ma5Var, List list) {
        TreeMap treeMap;
        n06 n06Var = ez5.o;
        int i = this.y;
        Object obj = this.z;
        String str = this.w;
        switch (i) {
            case 0:
                nw6.h(str, 3, list);
                String strZzi = ma5Var.b((ez5) list.get(0)).zzi();
                long jA = (long) nw6.a(ma5Var.b((ez5) list.get(1)).zzh().doubleValue());
                ez5 ez5VarB = ma5Var.b((ez5) list.get(2));
                ((List) ((xi5) obj).z).add(new ds5(strZzi, jA, ez5VarB instanceof hy5 ? nw6.g((hy5) ez5VarB) : new HashMap()));
                return n06Var;
            case 1:
                return n06Var;
            default:
                nw6.h(str, 3, list);
                ma5Var.b((ez5) list.get(0)).zzi();
                ez5 ez5VarB2 = ma5Var.b((ez5) list.get(1));
                if (!(ez5VarB2 instanceof az5)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                ez5 ez5VarB3 = ma5Var.b((ez5) list.get(2));
                if (!(ez5VarB3 instanceof hy5)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                hy5 hy5Var = (hy5) ez5VarB3;
                if (!hy5Var.a("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strZzi2 = hy5Var.zzf("type").zzi();
                int iB = hy5Var.a("priority") ? nw6.b(hy5Var.zzf("priority").zzh().doubleValue()) : AdError.NETWORK_ERROR_CODE;
                id7 id7Var = (id7) obj;
                az5 az5Var = (az5) ez5VarB2;
                id7Var.getClass();
                if ("create".equals(strZzi2)) {
                    treeMap = id7Var.b;
                } else {
                    if (!"edit".equals(strZzi2)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strZzi2)));
                    }
                    treeMap = id7Var.a;
                }
                if (treeMap.containsKey(Integer.valueOf(iB))) {
                    iB = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iB), az5Var);
                return n06Var;
        }
    }

    public n17(xi5 xi5Var) {
        super("internal.eventLogger");
        this.z = xi5Var;
    }

    public n17(id7 id7Var) {
        super("internal.registerCallback");
        this.z = id7Var;
    }
}
