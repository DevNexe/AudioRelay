package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class t6 extends cx1 implements j81<Object, uy2<? extends String, ? extends s42>> {
    public static final t6 w = new t6();

    public t6() {
        super(1);
    }

    @Override // defpackage.j81
    public final uy2<? extends String, ? extends s42> invoke(Object obj) {
        String string = UUID.randomUUID().toString();
        s42.QnHx qnHx = s42.Companion;
        return new uy2<>(string, Th.q());
    }
}
