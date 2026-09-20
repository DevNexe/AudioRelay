package defpackage;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.PurchasesError;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class zr3 {

    public /* synthetic */ class QnHx {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PackageType.values().length];
            iArr[PackageType.UNKNOWN.ordinal()] = 1;
            iArr[PackageType.CUSTOM.ordinal()] = 2;
            iArr[PackageType.LIFETIME.ordinal()] = 3;
            iArr[PackageType.ANNUAL.ordinal()] = 4;
            iArr[PackageType.SIX_MONTH.ordinal()] = 5;
            iArr[PackageType.THREE_MONTH.ordinal()] = 6;
            iArr[PackageType.TWO_MONTH.ordinal()] = 7;
            iArr[PackageType.MONTHLY.ordinal()] = 8;
            iArr[PackageType.WEEKLY.ordinal()] = 9;
            a = iArr;
        }
    }

    public static final void a(n52 n52Var, PurchasesError purchasesError) {
        n52Var.b("message", purchasesError.getMessage());
        String underlyingErrorMessage = purchasesError.getUnderlyingErrorMessage();
        if (underlyingErrorMessage != null) {
            n52Var.b("underlying_message", underlyingErrorMessage);
        }
    }

    public static final n43 b(Package r14) {
        switch (QnHx.a[r14.getPackageType().ordinal()]) {
            case 1:
                a62.a.f("got_unknonw_package_type", new as3(r14));
                return null;
            case 2:
                a62.a.f("got_unknonw_package_type", new as3(r14));
                return null;
            case 3:
                return new n43.QnHx(r14.getProduct().getSku(), r14, r14.getProduct().getPrice(), p43.F1.c);
            case 4:
                return new n43.CQf(r14.getProduct().getSku(), r14, r14.getProduct().getPrice(), p43.auxFixed.c, r14.getProduct().getFreeTrialPeriod());
            case 5:
                return new n43.CQf(r14.getProduct().getSku(), r14, r14.getProduct().getPrice(), p43.QnHx.c, r14.getProduct().getFreeTrialPeriod());
            case 6:
                return new n43.CQf(r14.getProduct().getSku(), r14, r14.getProduct().getPrice(), p43.NUlFixed.c, r14.getProduct().getFreeTrialPeriod());
            case 7:
                return new n43.CQf(r14.getProduct().getSku(), r14, r14.getProduct().getPrice(), p43.CQf.c, r14.getProduct().getFreeTrialPeriod());
            case 8:
                return new n43.CQf(r14.getProduct().getSku(), r14, r14.getProduct().getPrice(), p43.LPt8Fixed.c, r14.getProduct().getFreeTrialPeriod());
            case 9:
                return new n43.CQf(r14.getProduct().getSku(), r14, r14.getProduct().getPrice(), p43.YKK.c, r14.getProduct().getFreeTrialPeriod());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
