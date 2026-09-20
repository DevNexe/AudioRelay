package defpackage;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class j35 extends cx1 implements j81<z35, qq0> {
    public static final j35 w = new j35();

    public j35() {
        super(1);
    }

    @Override // defpackage.j81
    public final qq0 invoke(z35 z35Var) {
        z35 z35Var2 = z35Var;
        String str = z35Var2.g.w;
        int iC = s55.c(z35Var2.f);
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        int iFollowing = characterInstance.following(iC);
        if (iFollowing != -1) {
            return new cj0(0, iFollowing - s55.c(z35Var2.f));
        }
        return null;
    }
}
