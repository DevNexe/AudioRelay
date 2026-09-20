package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class qy1 extends cx1 implements h81<Float> {
    public final /* synthetic */ CharSequence w;
    public final /* synthetic */ TextPaint x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy1(CharSequence charSequence, UH8 uh8) {
        super(0);
        this.w = charSequence;
        this.x = uh8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h81
    public final Float invoke() {
        TextPaint textPaint = this.x;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = this.w;
        lineInstance.setText(new qp(charSequence.length(), charSequence));
        PriorityQueue<uy2> priorityQueue = new PriorityQueue(10, new sy1(0));
        int next = lineInstance.next();
        int i = 0;
        while (next != -1) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new uy2(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                uy2 uy2Var = (uy2) priorityQueue.peek();
                if (uy2Var != null && ((Number) uy2Var.x).intValue() - ((Number) uy2Var.w).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new uy2(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            int i2 = next;
            next = lineInstance.next();
            i = i2;
        }
        float fMax = 0.0f;
        for (uy2 uy2Var2 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(charSequence, ((Number) uy2Var2.w).intValue(), ((Number) uy2Var2.x).intValue(), textPaint));
        }
        return Float.valueOf(fMax);
    }
}
