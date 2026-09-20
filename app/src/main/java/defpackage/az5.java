package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class az5 extends uw5 {
    public final ma5 A;
    public final ArrayList y;
    public final ArrayList z;

    public az5(az5 az5Var) {
        super(az5Var.w);
        ArrayList arrayList = new ArrayList(az5Var.y.size());
        this.y = arrayList;
        arrayList.addAll(az5Var.y);
        ArrayList arrayList2 = new ArrayList(az5Var.z.size());
        this.z = arrayList2;
        arrayList2.addAll(az5Var.z);
        this.A = az5Var.A;
    }

    @Override // defpackage.uw5
    public final ez5 d(ma5 ma5Var, List list) {
        n06 n06Var;
        ma5 ma5VarA = this.A.a();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.y;
            int size = arrayList.size();
            n06Var = ez5.o;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                ma5VarA.f((String) arrayList.get(i), ma5Var.b((ez5) list.get(i)));
            } else {
                ma5VarA.f((String) arrayList.get(i), n06Var);
            }
            i++;
        }
        for (ez5 ez5Var : this.z) {
            ez5 ez5VarB = ma5VarA.b(ez5Var);
            if (ez5VarB instanceof mz5) {
                ez5VarB = ma5VarA.b(ez5Var);
            }
            if (ez5VarB instanceof uv5) {
                return ((uv5) ez5VarB).w;
            }
        }
        return n06Var;
    }

    @Override // defpackage.uw5, defpackage.ez5
    public final ez5 zzd() {
        return new az5(this);
    }

    public az5(String str, ArrayList arrayList, List list, ma5 ma5Var) {
        super(str);
        this.y = new ArrayList();
        this.A = ma5Var;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.y.add(((ez5) it.next()).zzi());
            }
        }
        this.z = new ArrayList(list);
    }
}
