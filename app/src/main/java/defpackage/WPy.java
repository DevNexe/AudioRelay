package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class WPy extends cx1 implements h81<String> {
    public static final WPy w = new WPy();

    public WPy() {
        super(0);
    }

    @Override // defpackage.h81
    public final String invoke() {
        return UUID.randomUUID().toString();
    }
}
