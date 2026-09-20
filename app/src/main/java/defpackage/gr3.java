package defpackage;

import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gr3 extends cx1 implements j81<Offering, List<? extends Package>> {
    public static final gr3 w = new gr3();

    public gr3() {
        super(1);
    }

    @Override // defpackage.j81
    public final List<? extends Package> invoke(Offering offering) {
        return offering.getAvailablePackages();
    }
}
