package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class w27 extends hy5 {
    public final xi5 x;

    public w27(xi5 xi5Var) {
        this.x = xi5Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    @Override // defpackage.hy5, defpackage.ez5
    public final ez5 c(String str, ma5 ma5Var, ArrayList arrayList) {
        byte b;
        switch (str) {
            case "getEventName":
                b = 0;
                break;
            case "getTimestamp":
                b = 3;
                break;
            case "getParamValue":
                b = 1;
                break;
            case "getParams":
                b = 2;
                break;
            case "setParamValue":
                b = 5;
                break;
            case "setEventName":
                b = 4;
                break;
            default:
                b = -1;
                break;
        }
        xi5 xi5Var = this.x;
        if (b == 0) {
            nw6.h("getEventName", 0, arrayList);
            return new f06(((ds5) xi5Var.y).a);
        }
        if (b == 1) {
            nw6.h("getParamValue", 1, arrayList);
            String strZzi = ma5Var.b((ez5) arrayList.get(0)).zzi();
            HashMap map = ((ds5) xi5Var.y).c;
            return wx6.b(map.containsKey(strZzi) ? map.get(strZzi) : null);
        }
        if (b == 2) {
            nw6.h("getParams", 0, arrayList);
            HashMap map2 = ((ds5) xi5Var.y).c;
            hy5 hy5Var = new hy5();
            for (String str2 : map2.keySet()) {
                hy5Var.b(str2, wx6.b(map2.get(str2)));
            }
            return hy5Var;
        }
        if (b == 3) {
            nw6.h("getTimestamp", 0, arrayList);
            return new gw5(Double.valueOf(((ds5) xi5Var.y).b));
        }
        if (b == 4) {
            nw6.h("setEventName", 1, arrayList);
            ez5 ez5VarB = ma5Var.b((ez5) arrayList.get(0));
            if (ez5.o.equals(ez5VarB) || ez5.p.equals(ez5VarB)) {
                throw new IllegalArgumentException("Illegal event name");
            }
            ((ds5) xi5Var.y).a = ez5VarB.zzi();
            return new f06(ez5VarB.zzi());
        }
        if (b != 5) {
            return super.c(str, ma5Var, arrayList);
        }
        nw6.h("setParamValue", 2, arrayList);
        String strZzi2 = ma5Var.b((ez5) arrayList.get(0)).zzi();
        ez5 ez5VarB2 = ma5Var.b((ez5) arrayList.get(1));
        ds5 ds5Var = (ds5) xi5Var.y;
        Object objF = nw6.f(ez5VarB2);
        HashMap map3 = ds5Var.c;
        if (objF == null) {
            map3.remove(strZzi2);
        } else {
            map3.put(strZzi2, objF);
        }
        return ez5VarB2;
    }
}
