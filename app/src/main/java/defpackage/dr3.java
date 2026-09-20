package defpackage;

import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class dr3 extends cx1 implements j81<Offerings, sd5> {
    public final /* synthetic */ bs3 w;
    public final /* synthetic */ dl4<List<n43>> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr3(bs3 bs3Var, yk4.QnHx qnHx) {
        super(1);
        this.w = bs3Var;
        this.x = qnHx;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Offerings offerings) {
        Offering current;
        ArrayList arrayList;
        List<Package> availablePackages;
        Offerings offerings2 = offerings;
        bs3 bs3Var = this.w;
        if (bs3Var instanceof bs3.QnHx) {
            current = offerings2.get(((bs3.QnHx) bs3Var).a);
        } else {
            if (!ur1.a(bs3Var, bs3.CQf.a)) {
                throw new NoWhenBranchMatchedException();
            }
            current = offerings2.getCurrent();
        }
        if (current == null || (availablePackages = current.getAvailablePackages()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator<T> it = availablePackages.iterator();
            while (it.hasNext()) {
                n43 n43VarB = zr3.b((Package) it.next());
                if (n43VarB != null) {
                    arrayList.add(n43VarB);
                }
            }
        }
        dl4<List<n43>> dl4Var = this.x;
        if (arrayList != null) {
            ((yk4.QnHx) dl4Var).b(arrayList);
        } else {
            ((yk4.QnHx) dl4Var).c(new RuntimeException("Failed to find an offering"));
        }
        return sd5.a;
    }
}
