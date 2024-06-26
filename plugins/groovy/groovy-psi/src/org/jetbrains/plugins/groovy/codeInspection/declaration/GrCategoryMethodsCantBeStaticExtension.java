/*
 * Copyright 2000-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.plugins.groovy.codeInspection.declaration;

import com.intellij.openapi.util.Condition;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import org.jetbrains.plugins.groovy.lang.psi.api.statements.typedef.members.GrMethod;
import org.jetbrains.plugins.groovy.lang.psi.util.GdkMethodUtil;

public final class GrCategoryMethodsCantBeStaticExtension implements Condition<PsiElement> {
  @Override
  public boolean value(PsiElement t) {
    if (t instanceof GrMethod) {
      final PsiClass clazz = ((GrMethod)t).getContainingClass();
      if (clazz != null && GdkMethodUtil.getCategoryType(clazz) != null) {
        return true;
      }
    }

    return false;
  }
}
