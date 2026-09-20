package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface m80 {

    public static final class QnHx {
        public static final C0166QnHx a = new C0166QnHx();
        public static final CQf b = new CQf();

        public static final class CQf implements m80 {
            @Override // defpackage.m80
            public final long a(long j, long j2) {
                if (cm4.e(j) <= cm4.e(j2) && cm4.c(j) <= cm4.c(j2)) {
                    return ps0.d(1.0f, 1.0f);
                }
                float fMin = Math.min(cm4.e(j2) / cm4.e(j), cm4.c(j2) / cm4.c(j));
                return ps0.d(fMin, fMin);
            }
        }

        /* JADX INFO: renamed from: m80$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0166QnHx implements m80 {
            @Override // defpackage.m80
            public final long a(long j, long j2) {
                float fMin = Math.min(cm4.e(j2) / cm4.e(j), cm4.c(j2) / cm4.c(j));
                return ps0.d(fMin, fMin);
            }
        }
    }

    long a(long j, long j2);
}
