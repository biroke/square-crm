/*
 * This file is a part of Square, Customer Relationship Management Software for insurance's companies
 * Copyright (C) 2010-2012  SCUB <square@scub.net> - Mutuelle SMATIS FRANCE  <square@smatis.fr >
 * 
 * This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2 of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.square.composant.flux.opportunite.client.view;

import com.google.gwt.i18n.client.Constants;

/**
 * Constantes de la vue de la popup de modifications des quotas.
 * @author Nicolas NADEAU (nicolas.nadeau@scub.net) - SCUB
 */
public interface PopupModifQuotasViewImplConstants extends Constants {

    /**
     * Titre de la popup.
     * @return le titre.
     */
    String titrePopup();

    /**
     * Titre du panel du nombre d'opportunités.
     * @return le titre.
     */
    String titrePanelNbOpportunites();

    /**
     * Texte sur le bouton pour enregistrer.
     * @return le texte.
     */
    String btnEnregistrer();

    /**
     * Texte sur le bouton pour annuler.
     * @return le texte.
     */
    String btnAnnuler();
}
