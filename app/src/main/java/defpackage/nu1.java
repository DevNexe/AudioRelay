package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@za4(with = ou1.class)
public final class nu1 extends su1 {
    public static final nu1 INSTANCE = new nu1();
    public static final String w = "null";
    public static final /* synthetic */ oz1<rv1<Object>> x = qLd.h(2, QnHx.w);

    public static final class QnHx extends cx1 implements h81<rv1<Object>> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final rv1<Object> invoke() {
            return ou1.a;
        }
    }

    @Override // defpackage.su1
    public final String a() {
        return w;
    }

    public final rv1<nu1> serializer() {
        return (rv1) x.getValue();
    }
}
