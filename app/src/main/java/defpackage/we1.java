package defpackage;

import defpackage.hf1;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class we1<T extends hf1> {
    public boolean g;
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final QnHx d = QnHx.w;
    public boolean e = true;
    public boolean f = true;
    public final boolean h = v53.a;

    /* JADX WARN: Unknown type variable: TBuilder in type: j81<TBuilder, sd5> */
    public static final class CQf extends cx1 implements j81<Object, sd5> {
        public final /* synthetic */ j81<Object, sd5> w;
        public final /* synthetic */ j81<TBuilder, sd5> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: TBuilder in type: j81<? super TBuilder, sd5> */
        public CQf(j81<Object, sd5> j81Var, j81<? super TBuilder, sd5> j81Var2) {
            super(1);
            this.w = j81Var;
            this.x = j81Var2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.j81
        public final sd5 invoke(Object obj) {
            j81<Object, sd5> j81Var = this.w;
            if (j81Var != null) {
                j81Var.invoke(obj);
            }
            this.x.invoke((TBuilder) obj);
            return sd5.a;
        }
    }

    /* JADX WARN: Unknown type variable: TBuilder in type: kf1<TBuilder, TPlugin> */
    /* JADX WARN: Unknown type variable: TPlugin in type: kf1<TBuilder, TPlugin> */
    public static final class F1 extends cx1 implements j81<ue1, sd5> {
        public final /* synthetic */ kf1<TBuilder, TPlugin> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unknown type variable: TBuilder in type: kf1<? extends TBuilder, TPlugin> */
        /* JADX WARN: Unknown type variable: TPlugin in type: kf1<? extends TBuilder, TPlugin> */
        public F1(kf1<? extends TBuilder, TPlugin> kf1Var) {
            super(1);
            this.w = kf1Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.j81
        public final sd5 invoke(ue1 ue1Var) {
            ue1 ue1Var2 = ue1Var;
            Bpm bpm = (Bpm) ue1Var2.E.f(lf1.a, ye1.w);
            LinkedHashMap linkedHashMap = ue1Var2.G.b;
            kf1<TBuilder, TPlugin> kf1Var = this.w;
            Object objB = kf1Var.b((j81<? super TBuilder, sd5>) ((j81) linkedHashMap.get(kf1Var.getKey())));
            kf1Var.a((TPlugin) objB, ue1Var2);
            bpm.a(kf1Var.getKey(), objB);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<T, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(Object obj) {
            return sd5.a;
        }
    }

    public final <TBuilder, TPlugin> void a(kf1<? extends TBuilder, TPlugin> kf1Var, j81<? super TBuilder, sd5> j81Var) {
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.put(kf1Var.getKey(), new CQf((j81) linkedHashMap.get(kf1Var.getKey()), j81Var));
        LinkedHashMap linkedHashMap2 = this.a;
        if (linkedHashMap2.containsKey(kf1Var.getKey())) {
            return;
        }
        linkedHashMap2.put(kf1Var.getKey(), new F1(kf1Var));
    }
}
