package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.LPt8Fixed;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class or0 implements TextWatcher {
    public final EditText w;
    public QnHx y;
    public final boolean x = false;
    public boolean z = true;

    public static class QnHx extends LPt8Fixed.NUlFixed {
        public final WeakReference a;

        public QnHx(EditText editText) {
            this.a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.LPt8Fixed.NUlFixed
        public final void b() {
            or0.a((EditText) this.a.get(), 1);
        }
    }

    public or0(EditText editText) {
        this.w = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            LPt8Fixed lPt8A = LPt8Fixed.a();
            if (editableText == null) {
                length = 0;
            } else {
                lPt8A.getClass();
                length = editableText.length();
            }
            lPt8A.f(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        EditText editText = this.w;
        if (editText.isInEditMode()) {
            return;
        }
        if (this.z) {
            z = false;
            if (!this.x) {
                if (!(LPt8Fixed.j != null)) {
                    z = true;
                }
            }
        } else {
            z = true;
        }
        if (!z && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iB = LPt8Fixed.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    LPt8Fixed.a().f(i, i3 + i, (Spannable) charSequence);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            LPt8Fixed lPt8A = LPt8Fixed.a();
            if (this.y == null) {
                this.y = new QnHx(editText);
            }
            lPt8A.g(this.y);
        }
    }
}
