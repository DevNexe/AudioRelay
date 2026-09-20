package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class jx2 implements ix2 {
    public final Context a;

    public static final class CQf extends cx1 implements h81<QnHx> {
        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final QnHx invoke() {
            Set setSingleton;
            jx2 jx2Var = jx2.this;
            List<PackageInfo> installedPackages = jx2Var.a.getPackageManager().getInstalledPackages(0);
            List<PackageInfo> list = installedPackages;
            q95 q95Var = new q95(new uu(list), lx2.w);
            TreeSet treeSet = new TreeSet();
            na4.K0(q95Var, treeSet);
            q95 q95Var2 = new q95(new uu(list), new kx2(jx2Var));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            na4.K0(q95Var2, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                setSingleton = hs0.w;
            } else if (size == 1) {
                setSingleton = linkedHashSet;
                setSingleton = Collections.singleton(linkedHashSet.iterator().next());
            }
            setSingleton = linkedHashSet;
            return new QnHx(installedPackages, treeSet, setSingleton);
        }
    }

    public static final class QnHx {
        public final List<PackageInfo> a;
        public final Set<String> b;
        public final Set<String> c;

        public QnHx(List list, TreeSet treeSet, Set set) {
            this.a = list;
            this.b = treeSet;
            this.c = set;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return ur1.a(this.a, qnHx.a) && ur1.a(this.b, qnHx.b) && ur1.a(this.c, qnHx.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "PackageCache(packageInfo=" + this.a + ", packageNames=" + this.b + ", applicationLabels=" + this.c + ")";
        }
    }

    public jx2(Context context) {
        this.a = context;
        new ry4(new CQf());
    }

    @Override // defpackage.ix2
    public final kl4 a() {
        return new kl4(new il4(new r23(this, 5)), new d14(this, 1));
    }
}
