package defpackage;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.LPt8Fixed;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class jr0 implements InputFilter {
    public final TextView a;
    public QnHx b;

    public static class QnHx extends LPt8Fixed.NUlFixed {
        public final WeakReference a;
        public final WeakReference b;

        public QnHx(TextView textView, jr0 jr0Var) {
            this.a = new WeakReference(textView);
            this.b = new WeakReference(jr0Var);
        }

        @Override // androidx.emoji2.text.LPt8Fixed.NUlFixed
        public final void b() {
            boolean z;
            int length;
            InputFilter[] filters;
            TextView textView = (TextView) this.a.get();
            InputFilter inputFilter = (InputFilter) this.b.get();
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                int i = 0;
                while (true) {
                    if (i >= filters.length) {
                        z = false;
                        break;
                    } else {
                        if (filters[i] == inputFilter) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = false;
                break;
            }
            if (z && textView.isAttachedToWindow()) {
                CharSequence text = textView.getText();
                LPt8Fixed lPt8A = LPt8Fixed.a();
                if (text == null) {
                    length = 0;
                } else {
                    lPt8A.getClass();
                    length = text.length();
                }
                CharSequence charSequenceF = lPt8A.f(0, length, text);
                if (text == charSequenceF) {
                    return;
                }
                int selectionStart = Selection.getSelectionStart(charSequenceF);
                int selectionEnd = Selection.getSelectionEnd(charSequenceF);
                textView.setText(charSequenceF);
                if (charSequenceF instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequenceF;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public jr0(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = LPt8Fixed.a().b();
        if (iB != 0) {
            boolean z = true;
            if (iB == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return LPt8Fixed.a().f(0, charSequence.length(), charSequence);
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        LPt8Fixed lPt8A = LPt8Fixed.a();
        if (this.b == null) {
            this.b = new QnHx(textView, this);
        }
        lPt8A.g(this.b);
        return charSequence;
    }
}
