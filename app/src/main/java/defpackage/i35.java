package defpackage;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class i35 extends cx1 implements j81<z35, qq0> {
    public static final i35 w = new i35();

    public i35() {
        super(1);
    }

    @Override // defpackage.j81
    public final qq0 invoke(z35 z35Var) {
        z35 z35Var2 = z35Var;
        int iC = s55.c(z35Var2.f);
        String str = z35Var2.g.w;
        int iC2 = s55.c(z35Var2.f);
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return new cj0(iC - characterInstance.preceding(iC2), 0);
    }
}
