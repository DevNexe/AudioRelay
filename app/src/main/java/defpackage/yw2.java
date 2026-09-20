package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yw2 extends cx1 implements j81<Object, Boolean> {
    public static final yw2 w = new yw2();

    public yw2() {
        super(1);
    }

    @Override // defpackage.j81
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(!((xw2) obj).isValid());
    }
}
