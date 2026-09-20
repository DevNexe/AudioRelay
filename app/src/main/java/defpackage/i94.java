package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i94 {
    public static final n94<List<String>> a = new n94<>("ContentDescription", QnHx.w);
    public static final n94<String> b = new n94<>("StateDescription");
    public static final n94<ze3> c = new n94<>("ProgressBarRangeInfo");
    public static final n94<String> d = new n94<>("PaneTitle", NUlFixed.w);
    public static final n94<sd5> e = new n94<>("SelectableGroup");
    public static final n94<bu> f = new n94<>("CollectionInfo");
    public static final n94<gu> g = new n94<>("CollectionItemInfo");
    public static final n94<sd5> h = new n94<>("Heading");
    public static final n94<sd5> i = new n94<>("Disabled");
    public static final n94<l42> j = new n94<>("LiveRegion");
    public static final n94<Boolean> k = new n94<>("Focused");
    public static final n94<sd5> l = new n94<>("InvisibleToUser", CQf.w);
    public static final n94<w54> m = new n94<>("HorizontalScrollAxisRange");
    public static final n94<w54> n = new n94<>("VerticalScrollAxisRange");
    public static final n94<sd5> o = new n94<>("IsPopup", LPt8Fixed.w);
    public static final n94<sd5> p = new n94<>("IsDialog", F1.w);
    public static final n94<zs3> q = new n94<>("Role", YKK.w);
    public static final n94<String> r = new n94<>("TestTag", auxFixed.w);
    public static final n94<List<Z7jl>> s = new n94<>("Text", T23.w);
    public static final n94<Z7jl> t = new n94<>("EditableText");
    public static final n94<s55> u = new n94<>("TextSelectionRange");
    public static final n94<hj1> v = new n94<>("ImeAction");
    public static final n94<Boolean> w = new n94<>("Selected");
    public static final n94<q85> x = new n94<>("ToggleableState");
    public static final n94<sd5> y = new n94<>("Password");
    public static final n94<String> z = new n94<>("Error");
    public static final n94<j81<Object, Integer>> A = new n94<>("IndexForKey");

    public static final class CQf extends cx1 implements x81<sd5, sd5, sd5> {
        public static final CQf w = new CQf();

        public CQf() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(sd5 sd5Var, sd5 sd5Var2) {
            return sd5Var;
        }
    }

    public static final class F1 extends cx1 implements x81<sd5, sd5, sd5> {
        public static final F1 w = new F1();

        public F1() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(sd5 sd5Var, sd5 sd5Var2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<sd5, sd5, sd5> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(2);
        }

        @Override // defpackage.x81
        public final sd5 invoke(sd5 sd5Var, sd5 sd5Var2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    public static final class NUlFixed extends cx1 implements x81<String, String, String> {
        public static final NUlFixed w = new NUlFixed();

        public NUlFixed() {
            super(2);
        }

        @Override // defpackage.x81
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }

    public static final class QnHx extends cx1 implements x81<List<? extends String>, List<? extends String>, List<? extends String>> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(2);
        }

        @Override // defpackage.x81
        public final List<? extends String> invoke(List<? extends String> list, List<? extends String> list2) {
            List<? extends String> list3 = list;
            List<? extends String> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayList = new ArrayList(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
    }

    public static final class T23 extends cx1 implements x81<List<? extends Z7jl>, List<? extends Z7jl>, List<? extends Z7jl>> {
        public static final T23 w = new T23();

        public T23() {
            super(2);
        }

        @Override // defpackage.x81
        public final List<? extends Z7jl> invoke(List<? extends Z7jl> list, List<? extends Z7jl> list2) {
            List<? extends Z7jl> list3 = list;
            List<? extends Z7jl> list4 = list2;
            if (list3 == null) {
                return list4;
            }
            ArrayList arrayList = new ArrayList(list3);
            arrayList.addAll(list4);
            return arrayList;
        }
    }

    public static final class YKK extends cx1 implements x81<zs3, zs3, zs3> {
        public static final YKK w = new YKK();

        public YKK() {
            super(2);
        }

        @Override // defpackage.x81
        public final zs3 invoke(zs3 zs3Var, zs3 zs3Var2) {
            zs3 zs3Var3 = zs3Var;
            int i = zs3Var2.a;
            return zs3Var3;
        }
    }

    public static final class auxFixed extends cx1 implements x81<String, String, String> {
        public static final auxFixed w = new auxFixed();

        public auxFixed() {
            super(2);
        }

        @Override // defpackage.x81
        public final String invoke(String str, String str2) {
            return str;
        }
    }
}
