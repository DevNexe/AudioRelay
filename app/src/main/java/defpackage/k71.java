package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k71 implements i91 {
    public final /* synthetic */ int w;

    public /* synthetic */ k71(int i) {
        this.w = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.i91
    public final Object apply(Object obj) {
        boolean z = false;
        z = false;
        boolean z2 = false;
        switch (this.w) {
            case 0:
                return sd5.a;
            case 1:
                dd3 dd3Var = (dd3) obj;
                if (dd3Var.b == null && !dd3Var.a()) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 2:
                int iOrdinal = ((z61) obj).a.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    z = true;
                } else if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return Boolean.valueOf(z);
            case 3:
                int iOrdinal2 = ((Ytae) obj).ordinal();
                if (iOrdinal2 == 0) {
                    return new wk4();
                }
                if (iOrdinal2 == 1) {
                    return new w72();
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                iy0 iy0Var = (iy0) obj;
                return iy0Var.d() != 2 ? vk4.e(new jo3()) : vk4.f(iy0Var);
            case 5:
                return new m03(((Boolean) obj).booleanValue());
            case 6:
                return ((hn2) obj).b;
            case 7:
                y73 y73Var = (y73) obj;
                return y73Var instanceof ym5 ? ((ym5) y73Var).a().a : "";
            case 8:
                return (s50) ((Optional) obj).get();
            case 9:
                return ((tk5.QnHx) obj).b;
            case 10:
                return Boolean.valueOf(((dd3) obj).a());
            case 11:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    return new cb2(th);
                }
                throw new NullPointerException("exception is null");
            case 12:
                return C0239D.I(gq0.g(((gq0) obj).w));
            case 13:
                return new cs2(vq2.D(((bq3) obj).a, TimeUnit.MILLISECONDS), new Acr(9));
            case 14:
                return new sr4((t50) obj);
            case 15:
                int iOrdinal3 = ((dk4) obj).ordinal();
                if (iOrdinal3 == 0) {
                    return or2.w;
                }
                if (iOrdinal3 == 1) {
                    return vq2.s(Boolean.TRUE);
                }
                if (iOrdinal3 == 2) {
                    return vq2.s(Boolean.FALSE);
                }
                throw new NoWhenBranchMatchedException();
            case 16:
                return new sy3.YKK((ty3) obj);
            case 17:
                return ((rz4) obj).b;
            case 18:
                return Boolean.valueOf(wu.B0((List) obj));
            case 19:
                xq0 xq0Var = (xq0) obj;
                if (xq0Var instanceof xq0.CQf) {
                    return vk4.f(Boolean.valueOf(((Boolean) ((xq0.CQf) xq0Var).a).booleanValue()));
                }
                if (xq0Var instanceof xq0.QnHx) {
                    return vk4.e((Throwable) ((xq0.QnHx) xq0Var).a);
                }
                throw new NoWhenBranchMatchedException();
            case 20:
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj2 : objArr) {
                    arrayList.add((no5) obj2);
                }
                return arrayList;
            case 21:
                return Boolean.valueOf(((Integer) obj).intValue() == 7);
            case 22:
                return (oe2) t92.P((Integer) obj, (Map) oe2.d.getValue());
            case 23:
                Object[] objArr2 = (Object[]) obj;
                ArrayList arrayList2 = new ArrayList(objArr2.length);
                for (Object obj3 : objArr2) {
                    arrayList2.add((List) obj3);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    su.x0((Iterable) it.next(), arrayList3);
                }
                return arrayList3;
            case 24:
                uy2 uy2Var = (uy2) obj;
                final long j = ((gq0) uy2Var.w).w;
                final List list = (List) uy2Var.x;
                return new ur2(new Callable() { // from class: q75
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        long j2 = j;
                        List<je4> list2 = list;
                        ArrayList arrayList4 = new ArrayList(mu.w0(list2, 10));
                        for (je4 je4Var : list2) {
                            arrayList4.add(new jg4(je4Var, je4Var.getCreationTime() + gq0.g(j2), j2, el0.F1.NEED_PREMIUM_FOR_UNLIMITED_DURATION));
                        }
                        return arrayList4;
                    }
                });
            case 25:
                return new sg.YKK((dh.QnHx) obj);
            default:
                return Boolean.valueOf(((Integer) obj).intValue() < 1);
        }
    }
}
