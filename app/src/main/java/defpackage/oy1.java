package defpackage;

import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class oy1 extends cx1 implements h81<BoringLayout.Metrics> {
    public final /* synthetic */ int w;
    public final /* synthetic */ CharSequence x;
    public final /* synthetic */ TextPaint y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy1(int i, UH8 uh8, CharSequence charSequence) {
        super(0);
        this.w = i;
        this.x = charSequence;
        this.y = uh8;
    }

    @Override // defpackage.h81
    public final BoringLayout.Metrics invoke() {
        TextDirectionHeuristic textDirectionHeuristicA = n55.a(this.w);
        CharSequence charSequence = this.x;
        if (textDirectionHeuristicA.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, this.y, null);
    }
}
